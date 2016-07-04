$(document).ready(function() {
    $.get('/races')
        .success(function(data) {
            $("#raceSelect").append('<option value="" selected disabled>Please select a race...</option>');
            data.forEach(function(race) {
                $("#raceSelect").append('<option value="'+race+'">'+race+'</option>');
            });
        });
});


//$(document).ready(function() {
//    $('#property-overview').dataTable({
//        //"sPaginationType": "full_numbers",
//
//        columns: [
//            { "data": count++},
//            { "data":"name"},
//            { "data":"rank"}
//        ],
//        "bProcessing": true,
//        "sAjaxDataProp":"",
//        bServerSide: true,
//        sAjaxSource: "/humans",
//        sServerMethod: "POST",
//        "bDestroy": true
//    });
//});


$(document).on('change', '#raceSelect', function() {
    console.log($(this).val()); // the selected options’s value

    if ($(this).val() === 'ORKS') {
        var image_table = $('#property-overview').dataTable({
            //"sPaginationType": "full_numbers",
            columns: [
                { "data": null},
                { "data":"name"},
                { "data":"rank"}
            ],
            "bProcessing": true,
            "fnDrawCallback": function() {
                recalculate_image_row_numbers();
            },
            "sAjaxDataProp":"",
            bServerSide: true,
            sAjaxSource: "/orks",
            sServerMethod: "POST",
            "bDestroy": true
        });


    } else {
        var image_table = $('#property-overview').dataTable({
            //"sPaginationType": "full_numbers",
            columns: [
                { "data": null},
                { "data":"name"},
                { "data":"rank"}
            ],
            "bProcessing": true,
            "sAjaxDataProp":"",
            bServerSide: true,
            sAjaxSource: "/humans",
            sServerMethod: "POST",
            "bDestroy": true,
            "fnDrawCallback": function() {
                recalculate_image_row_numbers();
            },
        });
    }

    function recalculate_image_row_numbers() {
        if (typeof image_table != "undefined") {
            var table_rows = image_table.fnGetNodes();
            $.each(table_rows, function(index){
                $("td:first", this).html(index+1);
            });
        }
    }
});


$('#property-overview').dataTable( {
    //"sPaginationType": "full_numbers",
    columns: [
        { "data":"id"},
        { "data":"name"},
        { "data":"rank"}
    ],
    "bProcessing": true,
    "sAjaxDataProp":"",
    bServerSide: true,
    sAjaxSource: "/orks",
    sServerMethod: "POST"
});