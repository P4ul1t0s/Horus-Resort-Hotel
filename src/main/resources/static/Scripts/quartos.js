let listaQuartos = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/quartos",
    success: function(arrayDeQuartos){
        for (let quarto of arrayDeQuartos) {

            listaQuartos +=`<li class="objetos">
                                ID do quarto: ${quarto.id}<br>
                                Categoria: ${quarto.categoria}<br>
                                Adultos (qtd): ${quarto.capacidadeAdultos}<br>
                                Crianças (qtd): ${quarto.capacidadeCriancas}<br>
                                Valor diária: R$${quarto.diaria}<br>
                                Ocupação: ${quarto.ocupado}<br>
                                <a href='/back/quartos/deletar/${quarto.id}'>Excluir</a>
                            </li>`
        }
        $("#lista-quartos").append(listaQuartos)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})
