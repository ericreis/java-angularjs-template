namespace App.Services.Http {
    "use strict";

    export class HomeDataService extends Base.HttpService {

        public static $inject = ['$http', '$q'];

        public constructor($http: ng.IHttpService,
                           $q: ng.IQService) {
            super('home', $http, $q);
        }

        public Get(): ng.IPromise<any> {
            return super.Get("get");
        }

    }

    angular.module(App.Config.MODULE_NAME).service('HomeDataService', HomeDataService);
}