function searchCalc() {
    var input, filter, div, p, a, i;
    input = document.getElementById("myInput","myInput2");
    filter = input.value.toUpperCase();
    div = document.getElementById("atoz-list");
    p = div.getElementsByTagName("p");
    for (i = 0; i < p.length; i++) {
        a = p[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            p[i].style.display = "";
        } else {
            p[i].style.display = "none";

        }
    }
}
