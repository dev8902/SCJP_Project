/**
 * 
 */
function isValid(frm) {
	var sid=frm.stu_id;
	var snm=frm.stu_name;
	var add=frm.stu_add;
	if(check(sid)&&isNumber(sid)&&check(snm)&&check(sadd)){
		return true;
	}else{
		return false;
	}
}

function check(cmd) {
	if(cmd.value=""){
		alert(cmd.name+" "+"Field Missed");
		cmd.focus();
		return false;
	}
	return true;
}

function isNumber(cmd){
	if(isNaN(cmd.value)){
		alert("STUDENT ID should be numeric value");
		cmd.focus();
		return false;
	}
	return true;
}

function Valid(){
	if(stu_id.value==""){
		alert(f.stu_id.name+""+"Field Missed");
		f.stu_id.focus();
		return false;
	}
	if(isNaN(f.stu_id.value)){
		alert("Student ID should be numeric value");
		f.stu_id.focus();
		return false;
	}
	return true;
}