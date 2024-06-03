package demo;


/**
 * 验证字符串是否符合IPV4 或者 IPV6
 */
public class Solution_009 {


    public String solve(String IP) {

        if (isInvalidIpv4(IP)) {
            return "IPv4";
        }

        if (isInvalidIpv6(IP)) {
            return "IPv6";
        }
        return "Neither";
    }

    protected boolean isInvalidIpv4(String IP) {

        String[] ipv4s = IP.split("\\.", -1);
        if (ipv4s.length != 4) {
            return false;
        }

        for (String ipv4 : ipv4s) {
            if (ipv4.startsWith("0") || !ipv4.matches("\\d+") || Integer.parseInt(ipv4) > 255) {
                return false;
            }

        }
        return true;
    }

    protected boolean isInvalidIpv6(String IP) {
        String[] ipv6s = IP.split(":", -1);

        if (ipv6s.length != 8) {
            return false;
        }

        int max = Integer.parseInt("FFFF", 16);
        for (String ipv6 : ipv6s) {
            if (ipv6.equals("0") || ipv6.equals("0000")) {
                continue;
            }
            if (ipv6.length() != 4 || !ipv6.matches("[0-9,A-F,a-f]{4}") || Integer.parseInt(ipv6, 16) > max) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1.1.1.1";
        String res = new Solution_009().solve(str);
        System.out.println(res);
    }
}
