package lesson15;

import java.util.Objects;

public class Dialog {
    private String tema;

    public Dialog() {
    }

    public Dialog(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dialog dialog = (Dialog) o;
        return Objects.equals(tema, dialog.tema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tema);
    }

    @Override
    public String toString() {
        return "Тема диалога " + tema;
    }
}
