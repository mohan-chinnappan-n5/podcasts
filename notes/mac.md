A MAC address (Media Access Control address) is a unique identifier assigned to a network interface controller (NIC) for communication on a physical network. It serves as the hardware address for devices connected to a network, enabling devices to identify and communicate with each other at the data link layer of the OSI model.

Structure of a MAC Address
	•	Length: A MAC address is 48 bits (6 bytes) long.
	•	Format: It is usually represented in hexadecimal and separated by colons : or hyphens -.
	•	Example: 00:1A:2B:3C:4D:5E or 00-1A-2B-3C-4D-5E.
	•	The address is divided into two parts:
	1.	Organizationally Unique Identifier (OUI):
	•	The first 24 bits (first 3 bytes) represent the manufacturer of the NIC.
	•	Example: 00:1A:2B could be assigned to a specific company like Intel or Cisco.
	2.	Device Identifier:
	•	The last 24 bits (last 3 bytes) uniquely identify the specific device manufactured by the vendor.

Types of MAC Addresses
	1.	Unicast:
	•	Used for communication between two specific devices.
	•	The least significant bit of the first byte is 0.
	2.	Multicast:
	•	Used for communication to a group of devices.
	•	The least significant bit of the first byte is 1.
	3.	Broadcast:
	•	Used to communicate with all devices on the network.
	•	A broadcast MAC address is FF:FF:FF:FF:FF:FF.

How MAC Addresses Work
	1.	When a device sends data over a network, the MAC address is included in the frame header.
	2.	Switches and routers use MAC addresses to direct frames to the correct recipient within the local network.

Key Characteristics
	•	Globally Unique:
	•	MAC addresses are intended to be unique for each device, ensuring no two devices on the same network have the same address.
	•	Permanent:
	•	Typically “burned into” the hardware (e.g., in the NIC), although it can sometimes be modified (e.g., MAC address spoofing).
	•	Layer 2 Identifier:
	•	Operates at the Data Link Layer (Layer 2) of the OSI model, unlike IP addresses, which operate at Layer 3.

Use Cases
	1.	Network Communication:
	•	Identifying devices on a LAN (Local Area Network).
	2.	Access Control:
	•	Used in MAC address filtering to allow or block devices on a network.
	3.	Device Tracking:
	•	For identifying specific devices in a network or during troubleshooting.
	4.	Packet Delivery:
	•	Ensures packets are delivered to the correct physical device on a LAN.

MAC Address vs. IP Address

Aspect	MAC Address	IP Address
Scope	Local network	Global (across networks)
Assignment	Burned into hardware	Assigned dynamically or statically
Layer	Data Link Layer (OSI Layer 2)	Network Layer (OSI Layer 3)
Format	Hexadecimal (48-bit)	Dotted decimal (IPv4) or alphanumeric (IPv6)

Security Implications
	1.	MAC Address Spoofing:
	•	Attackers can change their MAC address to impersonate another device or bypass security filters.
	2.	Privacy Concerns:
	•	MAC addresses can be used to track devices across Wi-Fi networks.

Fun Fact

The first 3 bytes of a MAC address (OUI) can be looked up to identify the manufacturer of a device. For example, 00:1A:2B could correspond to a network interface card made by Cisco.