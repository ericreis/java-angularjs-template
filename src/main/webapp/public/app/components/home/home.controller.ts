namespace App.Components.Home {

    import HomeDataService = App.Services.Http.HomeDataService;
	export class HomeController extends BaseController {

		public exampleParam: string;

		public static $inject: string[] = ['HomeDataService'];

		constructor(private homeDataService: HomeDataService) {
			super();

			this.homeDataService.Get().then((data) => {
				this.exampleParam = data.exampleParam;
			});
		}
	}

	angular.module(App.Config.MODULE_NAME).controller('HomeController', HomeController);
}