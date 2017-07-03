<html>
<head>
<script src='js/vue.js'></script>
<script src='js/axios.js'></script>
</head>
<body>
	<h2>Hello World!</h2>
	<div id="app">{{message}}</div>
	<script>
var vue=new Vue({
	el:'#app',
	data: {message: 'aaa'},
	created: function(){
		 axios.get('api/2').then(function(response) {
			vue.$data.message=response.data;
		}).catch(function(error){
			console.log(error);
		})
}
})



</script>


</body>
</html>
