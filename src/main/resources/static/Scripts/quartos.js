let listaQuartos = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/quartos",
    success: function(arrayDeQuartos){
        for (let quarto of arrayDeQuartos) {

            listaQuartos +=`<li id_=${quarto.id} class="objetos" onClick="editarQuarto(${quarto.id})">
                                <div class="idReal">ID do quarto: <span>${quarto.id}</span></div>
                                <div class="categoria">Categoria: <span>${quarto.categoria}</span></div>
                                <div class="adultos">Adultos (qtd): <span>${quarto.capacidadeAdultos}</span></div>
                                <div class="criancas">Crianças (qtd): <span>${quarto.capacidadeCriancas}</span></div>
                                <div class="diaria">Valor diária: R$<span>${quarto.diaria}</span></div>
                                Ocupação: ${quarto.ocupado}<br>
                            </li>`
        }
        $("#lista-quartos").append(listaQuartos)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})

function editarQuarto(id_quarto){
    $("#id-quarto-selecionado").html($(`li[id_=${id_quarto}].objetos`).find(".idReal span").text())
    $("#idHidden").val($(`li[id_=${id_quarto}].objetos`).find(".idReal span").text())
    $("#categoria_quarto").val($(`li[id_=${id_quarto}].objetos`).find(".categoria span").text())
    $("#capacidadeA_quarto").val($(`li[id_=${id_quarto}].objetos`).find(".adultos span").text())
    $("#capacidadeC_quarto").val($(`li[id_=${id_quarto}].objetos`).find(".criancas span").text())
    $("#diaria_quarto").val($(`li[id_=${id_quarto}].objetos`).find(".diaria span").text())
}

function limpar(){
    $("#id-quarto-selecionado").html("")
    $("#idHidden").val("")
    $("#categoria_quarto").val("")
    $("#capacidadeA_quarto").val("")
    $("#capacidadeC_quarto").val("")
    $("#diaria_quarto").val("")
}