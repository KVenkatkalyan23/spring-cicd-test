
@RestController
public  class TestController{
    @GetMapping("/version")
    public String test(){
        return "v8.0";
    }
}