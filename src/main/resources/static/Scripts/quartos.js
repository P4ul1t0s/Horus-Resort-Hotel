function listar(){
    const container = $("main").find("lista-quartos");
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "/quartos",
        success: function (data) {
            $.each(data,function(i, value){
                let objeto = $("<li class='objetos'></li>")
                $("<span class='span-id'>" + value.id + "</span>").appendTo($(objeto));
                $("<span class='span-categoria'>" + value.categoria + "</span>").appendTo($(objeto));
                $("<span class='span-capacidadeAdultos'>" + value.capacidadeAdultos + "</span>").appendTo($(objeto));
                $("<span class='span-capacidadeCriancas'>" + value.capacidadeCriancas + "</span>").appendTo($(objeto));
                $("<span class='span-diaria'>" + value.diaria + "</span>").appendTo($(objeto));
                $("<span class='span-ocupado'>" + value.ocupado + "</span>").appendTo($(objeto));
                // $(`<div class='item remover'><a href="#" onclick="deletar(${value.id})"><span class='material-symbols-outlined'>delete</span></a></div>`).appendTo($(linha));
                // $(`<div class='item editar'><a href="#"  onclick="editar(${value.id})"><span class="material-symbols-outlined">edit</span></a></div>`).appendTo($(linha));
                $(linha).attr("_id",value.id);
                $(linha).appendTo("#lista-quartos");
            })
            
        },
        error: function (data) {
            alert("Ops! algo deu errado ao carregar os dados dos clientes")
        },
        beforeSend: function () {
            // limpar();
            // let linhaTitulo = $("<div class='linha'></div>")
            // $("<div class='titulo'>Nome</div>").appendTo($(linhaTitulo));
            // $("<div class='titulo'>E-mail</div>").appendTo($(linhaTitulo));
            // $("<div class='titulo'></div>").appendTo($(linhaTitulo));
            // $("<div class='titulo'></div>").appendTo($(linhaTitulo));

            // $(linhaTitulo).appendTo("#container_clientes");
        }
    })
}

// function limpar(){
//     $("#container_clientes").find(".linha").remove();
//     // $("#container_clientes").find(".titulo").remove();
// }

// function deletar(id){
//     $.ajax({
//         type:"DELETE",
//         dataType:"json",
//         url:"cliente/delete/" + id,
//         success: function (data) {
//             alert("Cliente " + data.nome + " excluido com sucesso");
//             $("#container_clientes").find(`.linha[_id=${data.id}]`).remove();
//         },
//         error: function (data) {
//             alert("Ops! algo deu errado ao deletar os dados dos clientes");
//         },
//         beforeSend: function () {
//         }
//     })
// }