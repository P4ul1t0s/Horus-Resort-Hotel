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
})

//======================AJAX==============================

function listaFuncionarios() {
    let funcionarios = ""
    $.ajax({
        type: "GET", 
        dataType: "json", 
        url:"/funcionario",
        success: function(arrayFuncionarios){
            for (let funcionario of arrayFuncionarios) {
                funcionarios +=`<tr>
                                    <td> ${funcionario.id}</td>
                                    <td> ${funcionario.nome}</td>
                                    <td> ${funcionario.email}</td> 
                                    <td> ${funcionario.telefone}</td>
                                    <td>
                                        <button type="button" class="btn btn-warning">Editar</button>
                                        <button type="button" class="btn btn-danger">Excluir</button>
                                    </td>
                                </tr>`
            }
            $("#tabela-funcionarios").append(funcionarios)
        },
        error: function(){
            
        },
        beforeSend: function(){
            $('#listar').on('click', function() {
                $('#adicionar').removeClass('active')
                $('#listagem-funcionarios').show()
                $('#form-adiciona-funcionario').hide()
                $('#listar').addClass('active')
            })
        }
    })
}
