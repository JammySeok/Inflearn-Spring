package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int prot;

    public IpPort(String ip, int prot) {
        this.ip = ip;
        this.prot = prot;
    }
}
