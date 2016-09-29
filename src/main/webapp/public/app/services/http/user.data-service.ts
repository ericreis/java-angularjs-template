namespace App.Services.Http {
    "use strict";

    export class UserDataService extends Base.HttpService {

        public static $inject = ['$http', '$q'];

        public constructor($http: ng.IHttpService,
                           $q: ng.IQService) {
            super('user', $http, $q);
        }

        public getById(id: number): ng.IPromise<any> {
            return super.get("get/" + id);
        }

    }

    angular.module(App.Config.MODULE_NAME).service('UserDataService', UserDataService);
}