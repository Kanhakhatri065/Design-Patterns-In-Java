package BridgeExample.remotes;

import BridgeExample.devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote : mute");
        this.device.setVolume(0);
    }
}
