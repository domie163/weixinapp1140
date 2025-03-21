const base = {
    get() {
                return {
            url : "http://localhost:8080/ssma4m74/",
            name: "ssma4m74",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssma4m74/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "微信外卖小程序"
        } 
    }
}
export default base
