package Post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("board")
public class BoardRestController {
    private static final Logger logger = LoggerFactory.getLogger(BoardRestController.class);
    public List<BoardDto> boardList;
    private final BoardRepository boardRepository;

    public BoardRestController(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
        this.boardList = new ArrayList<>();

    }

    @PostMapping()
    public ResponseEntity<BoardDto> createBoard(@RequestBody BoardDto dto){
        return ResponseEntity.ok(boardRepository.save(dto));
    }

    @GetMapping()
    public ResponseEntity<Collection<BoardDto>> readBoardAll(){
        logger.info("in read Board all");
        return ResponseEntity.ok(this.boardRepository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<BoardDto> readBoard(@PathVariable("id") Long id){
        logger.info("in read Board");
        BoardDto dto = boardRepository.findById((id));
        if(dto == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateBoard(@PathVariable("id") Long id,
                                         @RequestBody BoardDto boardDto){
        if(!boardRepository.update(id, boardDto)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable("id") Long id){
        if(!boardRepository.delete(id)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }


}
