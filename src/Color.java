public enum Color {

    RED("#ff0000"),
    GREEN("#008000"),
    BLUE("#0000ff"),
    WHITE("#ffffff"),
    BLACK("#000000");

    private String hex;

    Color(String hex) {
        this.hex = hex;

    }
}
