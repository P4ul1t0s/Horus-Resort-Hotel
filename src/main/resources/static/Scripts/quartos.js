let listaQuartos = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/quartos",
    success: function(arrayDeQuartos){
        for (let quarto of arrayDeQuartos) {

            listaQuartos +=`<li class="objetos">
                                <p>Id: ${quarto.id}</p> 
                                <p>Categoria: ${quarto.categoria}</p> 
                                <p>Capacidade de adultos: ${quarto.capacidadeAdultos}</p> 
                                <p>Capacidade de crianças: ${quarto.capacidadeCriancas}</p> 
                                <p>Valor da diária: ${quarto.diaria}</p>
                            </li>`
        }
        $("#lista-quartos").append(listaQuartos)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})
