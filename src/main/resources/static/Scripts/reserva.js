let listaReservas = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/reservas",
    success: function(arrayReservas){
        for (let reserva of arrayReservas) {
            listaReservas +=`<li class="objetos">
                                ${reserva.status}
                                ${reserva.checkin}
                                ${reserva.checkout}
                                ${reserva.adultos}
                                ${reserva.criancas}
                                ${reserva.valorTotal}
                            </li>`
        }
        $("#lista-reserva").append(listaReservas)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})

function cadastrar(){
    var checkin = document.getElementById("checkin").value;
    var checkout = document.getElementById("checkout").value;
    var adultos = document.getElementById("adultos").value;
    var criancas = document.getElementById("criancas").value;
    var status = document.getElementById("status").value;
    var idQuarto = document.getElementById("idQuarto").value;
    var valorTotal = document.getElementById("valorTotal").value;
    
    location.href="/back/reserva/salvar"+checkin+checkout+adultos+criancas+status+idQuarto+valorTotal
}
