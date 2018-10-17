var init=function(){
	$('#user').blur(
			function(){
				$('#mensaje').load("prueba","user="+$('#user').val())
				
			}
	)

}
$().ready(init);