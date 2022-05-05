import SwiftUI
import shared

struct ContentView: View {
    @StateObject private var timezoneItems = TimezoneItems()

	var body: some View {
        TabView {
            TimeZoneView()
                .tabItem {
                    Label("Time Zones", systemImage: "network")
                }
        }
        .accentColor(Color.white)
        .environmentObject(timezoneItems)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
