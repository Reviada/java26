package FigursInterface;

//ИНТЕРФЕЙС - это набор требований, кот.обязаны быть в этом классе
//интерфейс отличия от класса
//1.создание объекта НЕТ в интерфейсе (в классе -можно)
//2.Все переменные по умолчанию со словом PUBLIC STATIC FINAL
//3.Все методы не имеют тело(нет реализации) и помечены словои absrtact
//implements - я соблюдаю требования
public interface Figura {

    //public abstract  можно не писать(public abstract double perimetr(););
    public abstract double perimetr();

    double ploshad();
}
