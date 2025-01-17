package ce.argoaws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ArgoController {

    @GetMapping("/argo")
    public String text() {
        return "Hello Argo, AWS, EKS";
    }

}
