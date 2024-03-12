@RestController
@RequestMapping("/api/dictionary")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/{word}")
    public Definition getDefinition(@PathVariable String word) {
        return dictionaryService.getDefinition(word);
    }
}