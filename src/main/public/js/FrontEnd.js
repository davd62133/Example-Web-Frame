function square() {
    console.log(document.getElementById("number").value);
    axios.get("/cuadrado?num="+document.getElementById("number").value)
        .then(function (response) {
            console.log(response.data);
            var html = "<p style='color:white'> The Square of the number is "+ response.data +"</p>"
            document.getElementById("all").innerHTML = html;
        })
}