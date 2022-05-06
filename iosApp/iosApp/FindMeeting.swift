//
//  FindMeeting.swift
//  iosApp
//
//  Created by Simon Rofe on 7/5/2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI
import shared

struct FindMeeting: View {
    @EnvironmentObject private var timezoneItems: TimezoneItems
    private var timezoneHelper = TimeZoneHelperImpl()
    @State private var meetingHours: [Int] = []
    @State private var showHoursDialog = false
    @State private var startDate = Calendar.current.date(bySettingHour: 8, minute: 0, second: 0, of: Date())!
    @State private var endDate = Calendar.current.date(bySettingHour: 17, minute: 0, second: 0, of: Date())!

    var body: some View {
        NavigationView {
            VStack {
                Spacer()
                    .frame(height: 8)
                // TODO: Add Form
            }
            .navigationTitle("Find Meeting Time")
            // TODO: Add sheet
        }
    }
}

struct FindMeeting_Previews: PreviewProvider {
    static var previews: some View {
        FindMeeting()
    }
}
