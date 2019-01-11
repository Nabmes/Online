$(function(){
	//solving menu problem
	
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Home':
		$('#nav_home').addClass('active');
		break;
	}
});