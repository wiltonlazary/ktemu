package com.soywiz.ktemu.cpu.z80

import com.soywiz.ktemu.common.noImpl

fun Z80State.execOneCB(op: Int) {
	when (op) {

		0x00 -> noImpl("RLC B")
		0x01 -> noImpl("RLC C")
		0x02 -> noImpl("RLC D")
		0x03 -> noImpl("RLC E")
		0x04 -> noImpl("RLC H")
		0x05 -> noImpl("RLC L")
		0x06 -> noImpl("RLC (HL)")
		0x07 -> noImpl("RLC A")
		0x08 -> noImpl("RRC B")
		0x09 -> noImpl("RRC C")
		0x0a -> noImpl("RRC D")
		0x0b -> noImpl("RRC E")
		0x0c -> noImpl("RRC H")
		0x0d -> noImpl("RRC L")
		0x0e -> noImpl("RRC (HL)")
		0x0f -> noImpl("RRC A")
		0x10 -> noImpl("RL B")
		0x11 -> noImpl("RL C")
		0x12 -> noImpl("RL D")
		0x13 -> noImpl("RL E")
		0x14 -> noImpl("RL H")
		0x15 -> noImpl("RL L")
		0x16 -> noImpl("RL (HL)")
		0x17 -> noImpl("RL A")
		0x18 -> noImpl("RR B")
		0x19 -> noImpl("RR C")
		0x1a -> noImpl("RR D")
		0x1b -> noImpl("RR E")
		0x1c -> noImpl("RR H")
		0x1d -> noImpl("RR L")
		0x1e -> noImpl("RR (HL)")
		0x1f -> noImpl("RR A")

		0x20 -> noImpl("SLA B")
		0x21 -> noImpl("SLA C")
		0x22 -> noImpl("SLA D")
		0x23 -> noImpl("SLA E")
		0x24 -> noImpl("SLA H")
		0x25 -> noImpl("SLA L")
		0x26 -> noImpl("SLA (HL)")
		0x27 -> noImpl("SLA A")

		0x28 -> noImpl("SRA B")
		0x29 -> noImpl("SRA C")
		0x2a -> noImpl("SRA D")
		0x2b -> noImpl("SRA E")
		0x2c -> noImpl("SRA H")
		0x2d -> noImpl("SRA L")
		0x2e -> noImpl("SRA (HL)")
		0x2f -> noImpl("SRA A")

		0x30 -> B = SLL(B, 4)
		0x31 -> C = SLL(C, 4)
		0x32 -> D = SLL(D, 4)
		0x33 -> E = SLL(E, 4)
		0x34 -> H = SLL(H, 4)
		0x35 -> L = SLL(L, 4)
		0x36 -> rHL = SLL(rHL, 4+7)
		0x37 -> A = SLL(A, 4)

		0x38 -> noImpl("SRL B")
		0x39 -> noImpl("SRL C")
		0x3a -> noImpl("SRL D")
		0x3b -> noImpl("SRL E")
		0x3c -> noImpl("SRL H")
		0x3d -> noImpl("SRL L")
		0x3e -> noImpl("SRL (HL)")
		0x3f -> noImpl("SRL A")

		0x40 -> BIT(0, B, 4)
		0x41 -> BIT(0, C, 4)
		0x42 -> BIT(0, D, 4)
		0x43 -> BIT(0, E, 4)
		0x44 -> BIT(0, H, 4)
		0x45 -> BIT(0, L, 4)
		0x46 -> BIT(0, rHL, 8)
		0x47 -> BIT(0, A, 4)

		0x48 -> BIT(1, B, 4)
		0x49 -> BIT(1, C, 4)
		0x4a -> BIT(1, D, 4)
		0x4b -> BIT(1, E, 4)
		0x4c -> BIT(1, H, 4)
		0x4d -> BIT(1, L, 4)
		0x4e -> BIT(1, rHL, 8)
		0x4f -> BIT(1, A, 4)

		0x50 -> BIT(2, B, 4)
		0x51 -> BIT(2, C, 4)
		0x52 -> BIT(2, D, 4)
		0x53 -> BIT(2, E, 4)
		0x54 -> BIT(2, H, 4)
		0x55 -> BIT(2, L, 4)
		0x56 -> BIT(2, rHL, 8)
		0x57 -> BIT(2, A, 4)

		0x58 -> BIT(3, B, 4)
		0x59 -> BIT(3, C, 4)
		0x5a -> BIT(3, D, 4)
		0x5b -> BIT(3, E, 4)
		0x5c -> BIT(3, H, 4)
		0x5d -> BIT(3, L, 4)
		0x5e -> BIT(3, rHL, 8)
		0x5f -> BIT(3, A, 4)

		0x60 -> BIT(4, B, 4)
		0x61 -> BIT(4, C, 4)
		0x62 -> BIT(4, D, 4)
		0x63 -> BIT(4, E, 4)
		0x64 -> BIT(4, H, 4)
		0x65 -> BIT(4, L, 4)
		0x66 -> BIT(4, rHL, 8)
		0x67 -> BIT(4, A, 4)

		0x68 -> BIT(5, B, 4)
		0x69 -> BIT(5, C, 4)
		0x6a -> BIT(5, D, 4)
		0x6b -> BIT(5, E, 4)
		0x6c -> BIT(5, H, 4)
		0x6d -> BIT(5, L, 4)
		0x6e -> BIT(5, rHL, 8)
		0x6f -> BIT(5, A, 4)

		0x70 -> BIT(6, B, 4)
		0x71 -> BIT(6, C, 4)
		0x72 -> BIT(6, D, 4)
		0x73 -> BIT(6, E, 4)
		0x74 -> BIT(6, H, 4)
		0x75 -> BIT(6, L, 4)
		0x76 -> BIT(6, rHL, 8)
		0x77 -> BIT(6, A, 4)

		0x78 -> BIT(7, B, 4)
		0x79 -> BIT(7, C, 4)
		0x7a -> BIT(7, D, 4)
		0x7b -> BIT(7, E, 4)
		0x7c -> BIT(7, H, 4)
		0x7d -> BIT(7, L, 4)
		0x7e -> BIT(7, rHL, 8)
		0x7f -> BIT(7, A, 4)

		0x80 -> noImpl("RES 0,B")
		0x81 -> noImpl("RES 0,C")
		0x82 -> noImpl("RES 0,D")
		0x83 -> noImpl("RES 0,E")
		0x84 -> noImpl("RES 0,H")
		0x85 -> noImpl("RES 0,L")
		0x86 -> noImpl("RES 0,(HL)")
		0x87 -> noImpl("RES 0,A")
		0x88 -> noImpl("RES 1,B")
		0x89 -> noImpl("RES 1,C")
		0x8a -> noImpl("RES 1,D")
		0x8b -> noImpl("RES 1,E")
		0x8c -> noImpl("RES 1,H")
		0x8d -> noImpl("RES 1,L")
		0x8e -> noImpl("RES 1,(HL)")
		0x8f -> noImpl("RES 1,A")
		0x90 -> noImpl("RES 2,B")
		0x91 -> noImpl("RES 2,C")
		0x92 -> noImpl("RES 2,D")
		0x93 -> noImpl("RES 2,E")
		0x94 -> noImpl("RES 2,H")
		0x95 -> noImpl("RES 2,L")
		0x96 -> noImpl("RES 2,(HL)")
		0x97 -> noImpl("RES 2,A")
		0x98 -> noImpl("RES 3,B")
		0x99 -> noImpl("RES 3,C")
		0x9a -> noImpl("RES 3,D")
		0x9b -> noImpl("RES 3,E")
		0x9c -> noImpl("RES 3,H")
		0x9d -> noImpl("RES 3,L")
		0x9e -> noImpl("RES 3,(HL)")
		0x9f -> noImpl("RES 3,A")
		0xa0 -> noImpl("RES 4,B")
		0xa1 -> noImpl("RES 4,C")
		0xa2 -> noImpl("RES 4,D")
		0xa3 -> noImpl("RES 4,E")
		0xa4 -> noImpl("RES 4,H")
		0xa5 -> noImpl("RES 4,L")
		0xa6 -> noImpl("RES 4,(HL)")
		0xa7 -> noImpl("RES 4,A")
		0xa8 -> noImpl("RES 5,B")
		0xa9 -> noImpl("RES 5,C")
		0xaa -> noImpl("RES 5,D")
		0xab -> noImpl("RES 5,E")
		0xac -> noImpl("RES 5,H")
		0xad -> noImpl("RES 5,L")
		0xae -> noImpl("RES 5,(HL)")
		0xaf -> noImpl("RES 5,A")
		0xb0 -> noImpl("RES 6,B")
		0xb1 -> noImpl("RES 6,C")
		0xb2 -> noImpl("RES 6,D")
		0xb3 -> noImpl("RES 6,E")
		0xb4 -> noImpl("RES 6,H")
		0xb5 -> noImpl("RES 6,L")
		0xb6 -> noImpl("RES 6,(HL)")
		0xb7 -> noImpl("RES 6,A")
		0xb8 -> noImpl("RES 7,B")
		0xb9 -> noImpl("RES 7,C")
		0xba -> noImpl("RES 7,D")
		0xbb -> noImpl("RES 7,E")
		0xbc -> noImpl("RES 7,H")
		0xbd -> noImpl("RES 7,L")
		0xbe -> noImpl("RES 7,(HL)")
		0xbf -> noImpl("RES 7,A")
		0xc0 -> noImpl("SET 0,B")
		0xc1 -> noImpl("SET 0,C")
		0xc2 -> noImpl("SET 0,D")
		0xc3 -> noImpl("SET 0,E")
		0xc4 -> noImpl("SET 0,H")
		0xc5 -> noImpl("SET 0,L")
		0xc6 -> noImpl("SET 0,(HL)")
		0xc7 -> noImpl("SET 0,A")
		0xc8 -> noImpl("SET 1,B")
		0xc9 -> noImpl("SET 1,C")
		0xca -> noImpl("SET 1,D")
		0xcb -> noImpl("SET 1,E")
		0xcc -> noImpl("SET 1,H")
		0xcd -> noImpl("SET 1,L")
		0xce -> noImpl("SET 1,(HL)")
		0xcf -> noImpl("SET 1,A")
		0xd0 -> noImpl("SET 2,B")
		0xd1 -> noImpl("SET 2,C")
		0xd2 -> noImpl("SET 2,D")
		0xd3 -> noImpl("SET 2,E")
		0xd4 -> noImpl("SET 2,H")
		0xd5 -> noImpl("SET 2,L")
		0xd6 -> noImpl("SET 2,(HL)")
		0xd7 -> noImpl("SET 2,A")
		0xd8 -> noImpl("SET 3,B")
		0xd9 -> noImpl("SET 3,C")
		0xda -> noImpl("SET 3,D")
		0xdb -> noImpl("SET 3,E")
		0xdc -> noImpl("SET 3,H")
		0xdd -> noImpl("SET 3,L")
		0xde -> noImpl("SET 3,(HL)")
		0xdf -> noImpl("SET 3,A")
		0xe0 -> noImpl("SET 4,B")
		0xe1 -> noImpl("SET 4,C")
		0xe2 -> noImpl("SET 4,D")
		0xe3 -> noImpl("SET 4,E")
		0xe4 -> noImpl("SET 4,H")
		0xe5 -> noImpl("SET 4,L")
		0xe6 -> noImpl("SET 4,(HL)")
		0xe7 -> noImpl("SET 4,A")
		0xe8 -> noImpl("SET 5,B")
		0xe9 -> noImpl("SET 5,C")
		0xea -> noImpl("SET 5,D")
		0xeb -> noImpl("SET 5,E")
		0xec -> noImpl("SET 5,H")
		0xed -> noImpl("SET 5,L")
		0xee -> noImpl("SET 5,(HL)")
		0xef -> noImpl("SET 5,A")
		0xf0 -> noImpl("SET 6,B")
		0xf1 -> noImpl("SET 6,C")
		0xf2 -> noImpl("SET 6,D")
		0xf3 -> noImpl("SET 6,E")
		0xf4 -> noImpl("SET 6,H")
		0xf5 -> noImpl("SET 6,L")
		0xf6 -> noImpl("SET 6,(HL)")
		0xf7 -> noImpl("SET 6,A")
		0xf8 -> noImpl("SET 7,B")
		0xf9 -> noImpl("SET 7,C")
		0xfa -> noImpl("SET 7,D")
		0xfb -> noImpl("SET 7,E")
		0xfc -> noImpl("SET 7,H")
		0xfd -> noImpl("SET 7,L")
		0xfe -> noImpl("SET 7,(HL)")
		0xff -> noImpl("SET 7,A")
	}
}
