namespace App.Components.User {

    import UserDataService = App.Services.Http.UserDataService;

    export class UserController extends BaseController {

        private userId: number;
        private user: any;

        private search: Function;

        public static $inject: string[] = ['UserDataService'];

        constructor(private userDataService: UserDataService) {
            super();

            this.search = () => {
                userDataService.getById(this.userId).then((data) => {
                    this.user = data;
                })
            };
        }
    }

    angular.module(App.Config.MODULE_NAME).controller('UserController', UserController);
}