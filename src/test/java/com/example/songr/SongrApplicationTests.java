package com.example.songr;

import com.example.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	public void testAlbumClass() {
		Album album = new Album("Something Just Like This","The Chainsmokers & Coldplay",12,251,"https://www.youtube.com/watch?v=FM7MFYoylVs&list=LL&index=156");


		assertEquals("Something Just Like This",album.getTitle());
		album.setArtist("Jessie J");
		assertEquals("Jessie J",album.getArtist());
	}

}
