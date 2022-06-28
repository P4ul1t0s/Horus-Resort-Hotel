function listar(){
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "/reserva",
        success: function (data) {
            console.log(data);
            $.each(data,function(i, value){
                let linha = $("<li class='objetos'></li>")
                // $("<span id='span-id'>" + value.nome + "</span>").appendTo($(linha));
                $("<span class='span-id'>" + value.checkin + "</span>").appendTo($(linha));
                $(linha).appendTo($("#lista-reserva"));
            })
            
        },
        error: function (data) {
            alert("ZSFSDFDSFDSOps! algo deu errado ao carregar os dados dos clientes")
        },
        beforeSend: function () {
           
        }
    })
}






/*
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
*/