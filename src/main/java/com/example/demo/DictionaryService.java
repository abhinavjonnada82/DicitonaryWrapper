@Service
public class DictionaryService {
    private static final String DICTIONARY_API_BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/";

    @Autowired
    private RestTemplate restTemplate;

    public Definition getDefinition(String word) {
        String url = DICTIONARY_API_BASE_URL + word;
        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Map<String, Object>>>() {});

        if (response.getStatusCode() == HttpStatus.OK) {
            List<Map<String, Object>> data = response.getBody();
            Map<String, Object> firstResult = data.get(0);
            List<Map<String, String>> meanings = (List<Map<String, String>>) firstResult.get("meanings");
            Map<String, String> firstMeaning = meanings.get(0);
            String description = firstMeaning.get("definitions").toString();

            return new Definition(word, description);
        } else {
            throw new RuntimeException("Error fetching definition for word: " + word);
        }
    }
}