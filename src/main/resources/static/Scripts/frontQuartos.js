let parametrosUrl = []
let listaQuartos = ""

function getParameters() {
        let urlString = window.location.href
        let paramString = urlString.split('?')[1];
        let params_arr = paramString.split('&');
        
        for(let i = 0; i < params_arr.length; i++) {
            let pair = params_arr[i].split('=');
            parametrosUrl.push(pair[1])
        }
        console.log(parametrosUrl)
    }

getParameters()



$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/quartos",
    success: function(arrayDeQuartos){
        for (let quarto of arrayDeQuartos) {

            if(quarto.capacidadeAdultos >= parametrosUrl[2] && quarto.capacidadeCriancas >= parametrosUrl[3]){
                listaQuartos +=`<li class="bloco-quarto">
                                    <p>Id: ${quarto.id}</p> 
                                    <p>Categoria: ${quarto.categoria}</p> 
                                    <p>Capacidade de adultos: ${quarto.capacidadeAdultos}</p> 
                                    <p>Capacidade de crianças: ${quarto.capacidadeCriancas}</p> 
                                    <p>Valor da diária: ${quarto.diaria}</p>
                                </li>`
            }

        }
        $("#lista-quartos").append(listaQuartos)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})

