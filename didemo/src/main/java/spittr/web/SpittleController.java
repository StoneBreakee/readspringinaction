package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.data.SpittleRepository;
import spittr.model.Spittle;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    // Method spittles(...) version 1
//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model){
    // Model实际是一个Map集合<key,Attribute>
    // 当调用addAttribute没有指定key时，那么key会根据值的对象类型推断确定
    // 在本例中，应为它是一个List<Spittle>，因此，键将会推断为spittleList
//        model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE,20));
//        return "spittles";
//    }

    // Method spittles(...) version 2
    // 逻辑视图的名称将会根据请求路径推断得出。因为这个方法处理针对"/spittles"的GET请求，因此视图的名称将会是spittle
    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max",defaultValue = MAX_LONG_AS_STRING) long max, @RequestParam(value = "count",defaultValue = "20") int count) {
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping(value = "/{spittleId}",method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId,Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
