module.exports = {
    initialize: function(developerId, test, enable) {
        cordova.exec(
			function (result) {
				console.log('Initialize Success.');
			},
			null,
            'AdSdk',
            'init',
            [developerId, test, enable]
        ); 
    }
};