public class ServiceStationImpl implements ServiceStation {
    @Override
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.service();
    }
}
