namespace App.Components.Home {

    export class HomeController extends BaseController {

		public exampleParam: string;

		public static $inject: string[] = ['$http'];

		constructor(private $http: ng.IHttpService) {
			super();

            var url: string = App.Config.API_URL + "/api/home/get";

            this.$http.get(url).then((response: any) => {
                this.exampleParam = response.data.exampleParam;
            });
		}
	}

	angular.module(App.Config.MODULE_NAME).controller('HomeController', HomeController);
}