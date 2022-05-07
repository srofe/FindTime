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
                Form {
                    Section(header: Text("Time Range")) {
                        DatePicker("Start Time", selection: $startDate, displayedComponents: .hourAndMinute)
                        DatePicker("End Time", selection: $endDate, displayedComponents: .hourAndMinute)
                    }
                    Section(header: Text("Time Zones")) {
                        ForEach(Array(timezoneItems.selectedTimezones), id: \.self) { timezone in
                            HStack {
                                Text(timezone)
                                Spacer()
                            }
                        }
                    }
                }
                Spacer()
                Button(action: {
                    meetingHours.removeAll()
                    let startHour = Calendar.current.component(.hour, from: startDate)
                    let endHour = Calendar.current.component(.hour, from: endDate)
                    let hours = timezoneHelper.search(
                        startHour: Int32(startHour),
                        endHour: Int32(endHour),
                        timezoneStrings: Array(timezoneItems.selectedTimezones))
                    let hourInts = hours.map { kotlinHour in
                        Int(truncating: kotlinHour)
                    }
                    meetingHours += hourInts
                    showHoursDialog = true
                }) {
                    Text("Search")
                        .foregroundColor(.black)
                }
                Spacer()
                    .frame(height: 8)
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
