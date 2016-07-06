$(document).ready(function() {
    $.get('/races')
        .success(function(data) {
            $("#raceSelect").append('<option value="" selected disabled>Please select a race...</option>');
            data.forEach(function(race) {
                $("#raceSelect").append('<option value="'+race+'">'+race+'</option>');
            });
        });
});

//fffffffffffffffffffffffffffffffffffffffffffffff

$(document).on('change', '#raceSelect', function() {
    var image_table = $('#property-overview').dataTable({
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
        sAjaxSource: "/humans/" + $(this).val(),
        sServerMethod: "POST",
        "bDestroy": true
    });

    function recalculate_image_row_numbers() {
        if (typeof image_table != "undefined") {
            var table_rows = image_table.fnGetNodes();
            $.each(table_rows, function(index){
                $("td:first", this).html(index+1);
            });
        }
    }
});