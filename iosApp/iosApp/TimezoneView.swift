//
//  TimezoneView.swift
//  iosApp
//
//  Created by Simon Rofe on 5/5/2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI
import shared

struct TimezoneView: View {
    @EnvironmentObject private var timezoneItems: TimezoneItems
    private var timezoneHelper = TimeZoneHelperImpl()
    @State private var currentDate = Date()
    let timer = Timer.publish(every: 1000, on: .main, in: .common).autoconnect()
    @State private var showTimezoneDialog = false

    var body: some View {
        VStack {
            TimeCard(timezone: timezoneHelper.currentTimeZone(),
                     time: DateFormatter.short.string(from: currentDate),
                     date: DateFormatter.long.string(from: currentDate))
            Spacer()
            // TODO: Add List
        }
        .onReceive(timer) { input in
            currentDate = input
        }
        .navigationTitle("World Clocks")
    }
    // TODO: Add toolbar
}

struct TimezoneView_Previews: PreviewProvider {
    static var previews: some View {
        TimezoneView()
    }
}
