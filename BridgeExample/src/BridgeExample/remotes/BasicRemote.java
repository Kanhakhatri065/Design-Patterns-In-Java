package BridgeExample.remotes;

import BridgeExample.devices.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote : power toggle");
        if(this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote : Volume down");
        this.device.setVolume(this.device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote : Volume up");
        this.device.setVolume(this.device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote : Channel down");
        this.device.setChannel(this.device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote : Channel up");
        this.device.setChannel(this.device.getChannel() + 1);
    }
}
