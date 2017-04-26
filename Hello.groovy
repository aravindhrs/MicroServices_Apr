@RestController
public class Hello{

@RequestMapping("/")
public String getmessage(){
	return "HelloWorld";
}

}
