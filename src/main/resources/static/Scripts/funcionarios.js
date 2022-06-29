$('#listar').on('click', function() {
    $('#adicionar').removeClass('active')
    $('#listagem-funcionarios').show()
    $('#form-adiciona-funcionario').hide()
    $('#listar').addClass('active')
})

$('#adicionar').on('click', function() {
    $('#adicionar').addClass('active')
    $('#listagem-funcionarios').hide()
    $('#form-adiciona-funcionario').show()
    $('#listar').removeClass('active')
    $('#editar').removeClass('active')
    $("#containerEditar").hide()
})

$('#editar').on('click', listaFuncionarios())

//======================AJAX==============================

function listaFuncionarios() {
    let funcionarios = ""
    $.ajax({
        type: "GET", 
        dataType: "json", 
        url:"/funcionario",
        success: function(arrayFuncionarios){
            for (let funcionario of arrayFuncionarios) {
                funcionarios +=`<tr id="funcionario_id_${funcionario.id}">
                                    <td> ${funcionario.id}</td>
                                    <td> ${funcionario.nome}</td>
                                    <td> ${funcionario.email}</td> 
                                    <td> ${funcionario.telefone}</td>
                                    <td>
                                        <input type="submit" class="btn btn-warning" value=Editar onclick="editarFuncionario(${funcionario.id})">
                                        <input type="submit" class="btn btn-danger" value=Deletar onclick="deletarFuncionario(${funcionario.id})">
                                    </td>
                                </tr>`
            }
            $("#tabela-funcionarios").append(funcionarios)
        },
        beforeSend: function(){
            $('#listar').on('click', function() {
                $('#adicionar').removeClass('active')
                $('#listagem-funcionarios').show()
                $('#form-adiciona-funcionario').hide()
                $('#listar').addClass('active')
                $('#containerEditar').hide()
                $('#editar').removeClass('active')
            })
        }
    })
}

function editarFuncionario(id){
    
    $.ajax({
        type:"GET",
        dataType:"json",
        url:"/funcionario/" + id,
        success: function (data) {
            $("#containerEditar").find("#id_funcionario").val(data.id);
            $("#containerEditar").find("#nome").val(data.nome);
            $("#containerEditar").find("#cpf").val(data.cpf);
            $("#containerEditar").find("#cep").val(data.cep);
            $("#containerEditar").find("#cidade").val(data.cidade);
            $("#containerEditar").find("#bairro").val(data.bairro);
            $("#containerEditar").find("#rua").val(data.rua);
            $("#containerEditar").find("#numero").val(data.numero);
            $("#containerEditar").find("#email").val(data.email);
            $("#containerEditar").find("#telefone").val(data.telefone);
            $("#containerEditar").find("#senha").val(data.senha);
        },
        error: function (data) {
            alert("Ops! algo deu errado ao carregar os dados dos clientes");
        },
        beforeSend: function () {
            $('#editar').addClass('active');
            $('#listar').removeClass('active');
            $('#adicionar').removeClass('active');
            $('#containerEditar').show();
            $('#form-adiciona-funcionario').hide()
            $('#listagem-funcionarios').hide()
        }
    })
}

function deletarFuncionario(id) {
    $.ajax({
        type:"DELETE",
        dataType:"json",
        url:"/funcionario/delete/" + id,
        success: function (data) {
            alert("Funcionário(a) " + data.nome + " excluído(a) com sucesso");
            $(`#funcionario_id_${data.id}`).remove();
        },
        error: function (data) {
            alert("Ops! algo deu errado ao deletar o funcionário");
        },
        beforeSend: function () {
        }
    })
}