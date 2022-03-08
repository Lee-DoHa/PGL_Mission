package Post;



public class BoardDto {
    private String name;
    private Long id;

    public BoardDto() {
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BoardDto(String name, Long id) {
        this.name = name;
        this.id = id;
    }

}
