window.onload=function(){


    const element = document.getElementById("telo");

    html2pdf().from(element).save();
    setTimeout(function(){ window.location.href="../admin/printAdmin" }, 300);
};