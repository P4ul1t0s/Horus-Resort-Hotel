function listar(){
    const container = $("main").find("container_hospede");
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "/hospede",
        success: function (data) {
            $.each(data,function(i, value){
                let linha = $("<div class='linha'></div>")
                $("<div class='item nome'>" + value.nome + "</div>").appendTo($(linha));
                $("<div class='item email'>" + value.email + "</div>").appendTo($(linha));
                $(`<div class='item remover'><a href="#" onclick="deletar(${value.id})"><span class='material-symbols-outlined'>delete</span></a></div>`).appendTo($(linha));
                $(`<div class='item editar'><a href="#"  onclick="editar(${value.id})"><span class="material-symbols-outlined">edit</span></a></div>`).appendTo($(linha));
                $(linha).attr("_id",value.id);
                $(linha).appendTo("#container_hospede");
            })
            
        },
        error: function (data) {
            alert("Ops! algo deu errado ao carregar os dados dos hospedes")
        },
        beforeSend: function () {
            limpar();
            let linhaTitulo = $("<div class='linha'></div>")
            $("<div class='titulo'>Nome</div>").appendTo($(linhaTitulo));
            $("<div class='titulo'>E-mail</div>").appendTo($(linhaTitulo));
            $("<div class='titulo'></div>").appendTo($(linhaTitulo));
            $("<div class='titulo'></div>").appendTo($(linhaTitulo));

            $(linhaTitulo).appendTo("#container_hospede");
        }
    })
}

function limpar(){
    $("#container_hospede").find(".linha").remove();
}

function deletar(id){
    $.ajax({
        type:"DELETE",
        dataType:"json",
        url:"hospede/delete/" + id,
        success: function (data) {
            alert("Hospede " + data.nome + " excluido com sucesso");
            $("#container_hospede").find(`.linha[_id=${data.id}]`).remove();
        },
        error: function (data) {
            alert("Ops! algo deu errado ao deletar os dados dos Hospedes");
        },
        beforeSend: function () {
        }
    })
}

function addHospede(){
    $("#containerCadHospede").removeClass("hidden");
    $("body").addClass("overlay");
}
function editar(id){
    $.ajax({
        type:"GET",
        dataType:"json",
        url:"/hospede/" + id,
        success: function (data) {
            addHospede();
            $("#containerCadHospede").find("#id_hospede").val(data.id);
            $("#containerCadHospede").find("#nome").val(data.nome);
            $("#containerCadHospede").find("#email").val(data.email);
        },
        error: function (data) {
            alert("Ops! algo deu errado ao carregar os dados dos hospedes");
        },
        beforeSend: function () {
        }
    })
}

function fechar(){
    $("#containerCadHospede").addClass("hidden");
    $("body").removeClass("overlay");
}