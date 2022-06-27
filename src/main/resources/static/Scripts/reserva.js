let funcionarios = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/funcionarios",
    success: function(arrayFuncionarios){
        for (let funcionario of arrayFuncionarios) {
            funcionarios +=`<li class="objetos">
                                ${funcionario.nome}
                            
                            
                            </li>`
        }
        $("#lista-funcionarios").append(funcionarios)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})