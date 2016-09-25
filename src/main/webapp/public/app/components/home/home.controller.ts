namespace App.Components.Home {

	export class HomeController extends BaseController {

		public exampleParam: string;

		public static $inject: string[] = [];

		constructor() {
			super();

			this.exampleParam = "Hello World!";
		}
	}

	angular.module(App.Config.MODULE_NAME).controller('HomeController', HomeController);
}