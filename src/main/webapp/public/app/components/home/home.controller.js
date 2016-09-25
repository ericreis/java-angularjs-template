var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var App;
(function (App) {
    var Components;
    (function (Components) {
        var Home;
        (function (Home) {
            var HomeController = (function (_super) {
                __extends(HomeController, _super);
                function HomeController() {
                    _super.call(this);
                    this.exampleParam = "Hello World!";
                }
                HomeController.$inject = [];
                return HomeController;
            }(Components.BaseController));
            Home.HomeController = HomeController;
            angular.module(App.Config.MODULE_NAME).controller('HomeController', HomeController);
        })(Home = Components.Home || (Components.Home = {}));
    })(Components = App.Components || (App.Components = {}));
})(App || (App = {}));
