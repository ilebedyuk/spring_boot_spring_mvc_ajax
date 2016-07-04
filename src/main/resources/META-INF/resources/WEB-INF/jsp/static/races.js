$(document).ready(function() {
    $.get('/races')
        .success(function(data) {
            $("#raceSelect").append('<option value="" selected disabled>Please select a race...</option>');
            data.forEach(function(race) {
                $("#raceSelect").append('<option value="'+race+'">'+race+'</option>');
            });
        });
});

$(document).ready(function() {
    $('#property-overview').dataTable({
        //"sPaginationType": "full_numbers",
        columns: [
            { "data":"id"},
            { "data":"name"},
            { "data":"rank"}
        ],
        "bProcessing": true,
        "sAjaxDataProp":"",
        bServerSide: true,
        sAjaxSource: "/humans",
        sServerMethod: "POST",
        "bDestroy": true
    });
});


$(document).on('change', '#raceSelect', function() {
    console.log($(this).val()); // the selected options’s value
    if ($(this).val() === 'ORKS') {
        $('#property-overview').dataTable({
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
            sServerMethod: "POST",
            "bDestroy": true
        });
    } else {
        $('#property-overview').dataTable({
            //"sPaginationType": "full_numbers",
            columns: [
                { "data":"id"},
                { "data":"name"},
                { "data":"rank"}
            ],
            "bProcessing": true,
            "sAjaxDataProp":"",
            bServerSide: true,
            sAjaxSource: "/humans",
            sServerMethod: "POST",
            "bDestroy": true
        });
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