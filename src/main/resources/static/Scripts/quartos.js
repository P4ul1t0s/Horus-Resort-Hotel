let listaQuartos = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/quartos",
    success: function(arrayDeQuartos){
        for (let quarto of arrayDeQuartos) {

            listaQuartos +=`<li class="objetos">
                                ${quarto.id}
                                ${quarto.categoria}
                                ${quarto.capacidadeAdultos}
                                ${quarto.capacidadeCriancas}
                                ${quarto.diaria}
                                ${quarto.ocupado}
                            </li>`
        }
        $("#lista-quartos").append(listaQuartos)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})
