//row insert
function userCreate(tableName) {
	var user = $("#Insert_Form").serialize();
		
	if('test_users' == tableName){
		urladd = "/ajaxwrite.do";
	}else if('test_board' == tableName){
		urladd = "/ajaxwriteboard.do";
	};
	
	$.ajax({
		type: "GET",
		url: urladd,
		data : user,
		success: function () {
			
		}
		
	});
};