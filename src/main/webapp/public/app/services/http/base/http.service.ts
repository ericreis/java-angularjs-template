namespace App.Services.Http.Base {

    export class HttpService {

        private baseServiceUrl: string;

        public constructor(controllerName: string,
                           protected $http: ng.IHttpService,
                           protected $q: ng.IQService) {
            this.baseServiceUrl = App.Config.API_URL + "/api/" + controllerName;
        }

        private getCleanStringParameters(stringParameters: string): string {
            if (stringParameters && stringParameters.length > 0) {
                return stringParameters;
            }

            return '';
        }

        private GetUrl(actionUrl: string, stringParameters?: string): string {
            return this.baseServiceUrl + '/' + actionUrl + this.getCleanStringParameters(stringParameters);
        }

        protected Get(actionUrl: string, stringParameters?: string, dontUseExceptionHandling?: boolean) {
            var defer = this.$q.defer();

            var url = this.GetUrl(actionUrl, stringParameters);

            this.$http.get(url).then(
                (data) => {
                    defer.resolve(data.data);
                },
                (error) => {
                    defer.reject(error);
                });

            return defer.promise;
        }

        protected Post(actionUrl: string, data: any, dontUseExceptionHandling?: boolean) {
            var url = this.GetUrl(actionUrl);

            var defer = this.$q.defer();

            this.$http.post(url, data).then(
                (data) => {
                    defer.resolve(data.data);
                },
                (error) => {
                    defer.reject(error);
                });

            return defer.promise;
        }
    }
}
